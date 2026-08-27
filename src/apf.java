import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class apf {
   static final Logger e = LogUtils.getLogger();
   public static final File a = new File("banned-ips.txt");
   public static final File b = new File("banned-players.txt");
   public static final File c = new File("ops.txt");
   public static final File d = new File("white-list.txt");

   static List<String> a(File $$0, Map<String, String[]> $$1) throws IOException {
      List<String> $$2 = Files.readLines($$0, StandardCharsets.UTF_8);

      for (String $$3 : $$2) {
         $$3 = $$3.trim();
         if (!$$3.startsWith("#") && $$3.length() >= 1) {
            String[] $$4 = $$3.split("\\|");
            $$1.put($$4[0].toLowerCase(Locale.ROOT), $$4);
         }
      }

      return $$2;
   }

   private static void a(MinecraftServer $$0, Collection<String> $$1, ProfileLookupCallback $$2) {
      String[] $$3 = $$1.stream().filter($$0x -> !ats.b($$0x)).toArray(String[]::new);
      if ($$0.U()) {
         $$0.ao().findProfilesByNames($$3, $$2);
      } else {
         for (String $$4 : $$3) {
            $$2.onProfileLookupSucceeded(iv.b($$4));
         }
      }
   }

   public static boolean a(final MinecraftServer $$0) {
      final apm $$1 = new apm(apg.b);
      if (b.exists() && b.isFile()) {
         if ($$1.b().exists()) {
            try {
               $$1.f();
            } catch (IOException var6) {
               e.warn("Could not load existing file {}", $$1.b().getName(), var6);
            }
         }

         try {
            final Map<String, String[]> $$3 = Maps.newHashMap();
            a(b, $$3);
            ProfileLookupCallback $$4 = new ProfileLookupCallback() {
               public void onProfileLookupSucceeded(GameProfile $$0x) {
                  $$0.ap().a($$0);
                  String[] $$1 = $$3.get($$0.getName().toLowerCase(Locale.ROOT));
                  if ($$1 == null) {
                     apf.e.warn("Could not convert user banlist entry for {}", $$0.getName());
                     throw new apf.a("Profile not in the conversionlist");
                  } else {
                     Date $$2 = $$1.length > 1 ? apf.a($$1[1], null) : null;
                     String $$3 = $$1.length > 2 ? $$1[2] : null;
                     Date $$4 = $$1.length > 3 ? apf.a($$1[3], null) : null;
                     String $$5 = $$1.length > 4 ? $$1[4] : null;
                     $$1.a(new apn($$0, $$2, $$3, $$4, $$5));
                  }
               }

               public void onProfileLookupFailed(String $$0x, Exception $$1x) {
                  apf.e.warn("Could not lookup user banlist entry for {}", $$0, $$1);
                  if (!($$1 instanceof ProfileNotFoundException)) {
                     throw new apf.a("Could not request user " + $$0 + " from backend systems", $$1);
                  }
               }
            };
            a($$0, $$3.keySet(), $$4);
            $$1.e();
            b(b);
            return true;
         } catch (IOException var4) {
            e.warn("Could not read old user banlist to convert it!", var4);
            return false;
         } catch (apf.a var5) {
            e.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean b(MinecraftServer $$0) {
      apd $$1 = new apd(apg.c);
      if (a.exists() && a.isFile()) {
         if ($$1.b().exists()) {
            try {
               $$1.f();
            } catch (IOException var11) {
               e.warn("Could not load existing file {}", $$1.b().getName(), var11);
            }
         }

         try {
            Map<String, String[]> $$3 = Maps.newHashMap();
            a(a, $$3);

            for (String $$4 : $$3.keySet()) {
               String[] $$5 = $$3.get($$4);
               Date $$6 = $$5.length > 1 ? a($$5[1], null) : null;
               String $$7 = $$5.length > 2 ? $$5[2] : null;
               Date $$8 = $$5.length > 3 ? a($$5[3], null) : null;
               String $$9 = $$5.length > 4 ? $$5[4] : null;
               $$1.a(new ape($$4, $$6, $$7, $$8, $$9));
            }

            $$1.e();
            b(a);
            return true;
         } catch (IOException var10) {
            e.warn("Could not parse old ip banlist to convert it!", var10);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean c(final MinecraftServer $$0) {
      final aph $$1 = new aph(apg.d);
      if (c.exists() && c.isFile()) {
         if ($$1.b().exists()) {
            try {
               $$1.f();
            } catch (IOException var6) {
               e.warn("Could not load existing file {}", $$1.b().getName(), var6);
            }
         }

         try {
            List<String> $$3 = Files.readLines(c, StandardCharsets.UTF_8);
            ProfileLookupCallback $$4 = new ProfileLookupCallback() {
               public void onProfileLookupSucceeded(GameProfile $$0x) {
                  $$0.ap().a($$0);
                  $$1.a(new api($$0, $$0.i(), false));
               }

               public void onProfileLookupFailed(String $$0x, Exception $$1x) {
                  apf.e.warn("Could not lookup oplist entry for {}", $$0, $$1);
                  if (!($$1 instanceof ProfileNotFoundException)) {
                     throw new apf.a("Could not request user " + $$0 + " from backend systems", $$1);
                  }
               }
            };
            a($$0, $$3, $$4);
            $$1.e();
            b(c);
            return true;
         } catch (IOException var4) {
            e.warn("Could not read old oplist to convert it!", var4);
            return false;
         } catch (apf.a var5) {
            e.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean d(final MinecraftServer $$0) {
      final apo $$1 = new apo(apg.e);
      if (d.exists() && d.isFile()) {
         if ($$1.b().exists()) {
            try {
               $$1.f();
            } catch (IOException var6) {
               e.warn("Could not load existing file {}", $$1.b().getName(), var6);
            }
         }

         try {
            List<String> $$3 = Files.readLines(d, StandardCharsets.UTF_8);
            ProfileLookupCallback $$4 = new ProfileLookupCallback() {
               public void onProfileLookupSucceeded(GameProfile $$0x) {
                  $$0.ap().a($$0);
                  $$1.a(new app($$0));
               }

               public void onProfileLookupFailed(String $$0x, Exception $$1x) {
                  apf.e.warn("Could not lookup user whitelist entry for {}", $$0, $$1);
                  if (!($$1 instanceof ProfileNotFoundException)) {
                     throw new apf.a("Could not request user " + $$0 + " from backend systems", $$1);
                  }
               }
            };
            a($$0, $$3, $$4);
            $$1.e();
            b(d);
            return true;
         } catch (IOException var4) {
            e.warn("Could not read old whitelist to convert it!", var4);
            return false;
         } catch (apf.a var5) {
            e.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }

   @Nullable
   public static UUID a(final MinecraftServer $$0, String $$1) {
      if (!ats.b($$1) && $$1.length() <= 16) {
         Optional<UUID> $$3 = $$0.ap().a($$1).map(GameProfile::getId);
         if ($$3.isPresent()) {
            return $$3.get();
         } else if (!$$0.O() && $$0.U()) {
            final List<GameProfile> $$4 = Lists.newArrayList();
            ProfileLookupCallback $$5 = new ProfileLookupCallback() {
               public void onProfileLookupSucceeded(GameProfile $$0x) {
                  $$0.ap().a($$0);
                  $$4.add($$0);
               }

               public void onProfileLookupFailed(String $$0x, Exception $$1) {
                  apf.e.warn("Could not lookup user whitelist entry for {}", $$0, $$1);
               }
            };
            a($$0, Lists.newArrayList(new String[]{$$1}), $$5);
            return !$$4.isEmpty() ? $$4.get(0).getId() : null;
         } else {
            return iv.a($$1);
         }
      } else {
         try {
            return UUID.fromString($$1);
         } catch (IllegalArgumentException var5) {
            return null;
         }
      }
   }

   public static boolean a(final akn $$0) {
      final File $$1 = g($$0);
      final File $$2 = new File($$1.getParentFile(), "playerdata");
      final File $$3 = new File($$1.getParentFile(), "unknownplayers");
      if ($$1.exists() && $$1.isDirectory()) {
         File[] $$4 = $$1.listFiles();
         List<String> $$5 = Lists.newArrayList();

         for (File $$6 : $$4) {
            String $$7 = $$6.getName();
            if ($$7.toLowerCase(Locale.ROOT).endsWith(".dat")) {
               String $$8 = $$7.substring(0, $$7.length() - ".dat".length());
               if (!$$8.isEmpty()) {
                  $$5.add($$8);
               }
            }
         }

         try {
            final String[] $$9 = $$5.toArray(new String[$$5.size()]);
            ProfileLookupCallback $$10 = new ProfileLookupCallback() {
               public void onProfileLookupSucceeded(GameProfile $$0x) {
                  $$0.ap().a($$0);
                  UUID $$1 = $$0.getId();
                  this.a($$2, this.a($$0.getName()), $$1.toString());
               }

               public void onProfileLookupFailed(String $$0x, Exception $$1x) {
                  apf.e.warn("Could not lookup user uuid for {}", $$0, $$1);
                  if ($$1 instanceof ProfileNotFoundException) {
                     String $$2 = this.a($$0);
                     this.a($$3, $$2, $$2);
                  } else {
                     throw new apf.a("Could not request user " + $$0 + " from backend systems", $$1);
                  }
               }

               private void a(File $$0x, String $$1x, String $$2x) {
                  File $$3 = new File($$1, $$1 + ".dat");
                  File $$4 = new File($$0, $$2 + ".dat");
                  apf.a($$0);
                  if (!$$3.renameTo($$4)) {
                     throw new apf.a("Could not convert file for " + $$1);
                  }
               }

               private String a(String $$0x) {
                  String $$1 = null;

                  for (String $$2 : $$9) {
                     if ($$2 != null && $$2.equalsIgnoreCase($$0)) {
                        $$1 = $$2;
                        break;
                     }
                  }

                  if ($$1 == null) {
                     throw new apf.a("Could not find the filename for " + $$0 + " anymore");
                  } else {
                     return $$1;
                  }
               }
            };
            a($$0, Lists.newArrayList($$9), $$10);
            return true;
         } catch (apf.a var12) {
            e.error("Conversion failed, please try again later", var12);
            return false;
         }
      } else {
         return true;
      }
   }

   static void a(File $$0) {
      if ($$0.exists()) {
         if (!$$0.isDirectory()) {
            throw new apf.a("Can't create directory " + $$0.getName() + " in world save directory.");
         }
      } else if (!$$0.mkdirs()) {
         throw new apf.a("Can't create directory " + $$0.getName() + " in world save directory.");
      }
   }

   public static boolean e(MinecraftServer $$0) {
      boolean $$1 = a();
      return $$1 && f($$0);
   }

   private static boolean a() {
      boolean $$0 = false;
      if (b.exists() && b.isFile()) {
         $$0 = true;
      }

      boolean $$1 = false;
      if (a.exists() && a.isFile()) {
         $$1 = true;
      }

      boolean $$2 = false;
      if (c.exists() && c.isFile()) {
         $$2 = true;
      }

      boolean $$3 = false;
      if (d.exists() && d.isFile()) {
         $$3 = true;
      }

      if (!$$0 && !$$1 && !$$2 && !$$3) {
         return true;
      } else {
         e.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
         e.warn("** please remove the following files and restart the server:");
         if ($$0) {
            e.warn("* {}", b.getName());
         }

         if ($$1) {
            e.warn("* {}", a.getName());
         }

         if ($$2) {
            e.warn("* {}", c.getName());
         }

         if ($$3) {
            e.warn("* {}", d.getName());
         }

         return false;
      }
   }

   private static boolean f(MinecraftServer $$0) {
      File $$1 = g($$0);
      if (!$$1.exists() || !$$1.isDirectory() || $$1.list().length <= 0 && $$1.delete()) {
         return true;
      } else {
         e.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
         e.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
         e.warn("** please restart the server and if the problem persists, remove the directory '{}'", $$1.getPath());
         return false;
      }
   }

   private static File g(MinecraftServer $$0) {
      return $$0.a(ecw.d).toFile();
   }

   private static void b(File $$0) {
      File $$1 = new File($$0.getName() + ".converted");
      $$0.renameTo($$1);
   }

   static Date a(String $$0, Date $$1) {
      Date $$2;
      try {
         $$2 = apb.a.parse($$0);
      } catch (ParseException var4) {
         $$2 = $$1;
      }

      return $$2;
   }

   static class a extends RuntimeException {
      a(String $$0, Throwable $$1) {
         super($$0, $$1);
      }

      a(String $$0) {
         super($$0);
      }
   }
}
