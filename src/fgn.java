import com.google.gson.JsonObject;
import java.util.Objects;
import javax.annotation.Nullable;

public class fgn extends fgv {
   public final boolean a;
   public final boolean b;
   public final int c;
   public final boolean d;
   public final boolean e;
   public final int f;
   public final int g;
   public final boolean h;
   private final String n;
   public final String i;
   public final fgi.a j;
   public long k;
   @Nullable
   public String l;
   public boolean m;
   private static final boolean o = false;
   private static final boolean p = true;
   private static final boolean q = true;
   private static final int r = 0;
   private static final boolean s = false;
   private static final int t = 2;
   private static final int u = 0;
   private static final boolean v = false;
   private static final String w = "";
   private static final String x = "";
   private static final fgi.a y = fgi.a.a;
   private static final long z = -1L;
   private static final String A = null;

   public fgn(boolean $$0, boolean $$1, int $$2, boolean $$3, int $$4, int $$5, boolean $$6, boolean $$7, String $$8, String $$9, fgi.a $$10) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.e = $$7;
      this.n = $$8;
      this.i = $$9;
      this.j = $$10;
   }

   public static fgn a() {
      return new fgn(true, true, 0, false, 2, 0, false, false, "", "", y);
   }

   public static fgn a(dfj $$0, bsh $$1, boolean $$2, String $$3, String $$4) {
      return new fgn(true, true, 0, false, $$1.a(), $$0.a(), $$2, false, $$4, $$3, y);
   }

   public static fgn a(dfq $$0, String $$1) {
      return a($$0.b(), $$0.d(), $$0.c(), $$1, $$0.a());
   }

   public static fgn b() {
      fgn $$0 = a();
      $$0.a(true);
      return $$0;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public static fgn a(JsonObject $$0) {
      fgn $$1 = new fgn(
         fir.a("pvp", $$0, true),
         fir.a("spawnMonsters", $$0, true),
         fir.a("spawnProtection", $$0, 0),
         fir.a("commandBlocks", $$0, false),
         fir.a("difficulty", $$0, 2),
         fir.a("gameMode", $$0, 0),
         fir.a("hardcore", $$0, false),
         fir.a("forceGameMode", $$0, false),
         fir.a("slotName", $$0, ""),
         fir.a("version", $$0, ""),
         fgi.d(fir.a("compatibility", $$0, fgi.a.a.name()))
      );
      $$1.k = fir.a("worldTemplateId", $$0, -1L);
      $$1.l = fir.b("worldTemplateImage", $$0, A);
      return $$1;
   }

   public String a(int $$0) {
      if (baj.h(this.n)) {
         return this.m ? hal.a("mco.configure.world.slot.empty") : this.b($$0);
      } else {
         return this.n;
      }
   }

   public String b(int $$0) {
      return hal.a("mco.configure.world.slot", $$0);
   }

   public String c() {
      JsonObject $$0 = new JsonObject();
      if (!this.a) {
         $$0.addProperty("pvp", this.a);
      }

      if (!this.b) {
         $$0.addProperty("spawnMonsters", this.b);
      }

      if (this.c != 0) {
         $$0.addProperty("spawnProtection", this.c);
      }

      if (this.d) {
         $$0.addProperty("commandBlocks", this.d);
      }

      if (this.f != 2) {
         $$0.addProperty("difficulty", this.f);
      }

      if (this.g != 0) {
         $$0.addProperty("gameMode", this.g);
      }

      if (this.h) {
         $$0.addProperty("hardcore", this.h);
      }

      if (this.e) {
         $$0.addProperty("forceGameMode", this.e);
      }

      if (!Objects.equals(this.n, "")) {
         $$0.addProperty("slotName", this.n);
      }

      if (!Objects.equals(this.i, "")) {
         $$0.addProperty("version", this.i);
      }

      if (this.j != y) {
         $$0.addProperty("compatibility", this.j.name());
      }

      return $$0.toString();
   }

   public fgn d() {
      return new fgn(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.e, this.n, this.i, this.j);
   }
}
