import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ams {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final ams.c c;
   private final te d;
   private final ams.a e;
   private final ams.b f;
   private final boolean g;
   private final boolean h;
   private final amw i;

   @Nullable
   public static ams a(String $$0, te $$1, boolean $$2, ams.c $$3, alz $$4, ams.b $$5, amw $$6) {
      int $$7 = aa.b().a($$4);
      ams.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static ams a(String $$0, te $$1, boolean $$2, ams.c $$3, ams.a $$4, ams.b $$5, boolean $$6, amw $$7) {
      return new ams($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private ams(String $$0, boolean $$1, ams.c $$2, te $$3, ams.a $$4, ams.b $$5, boolean $$6, amw $$7) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.g = $$1;
      this.f = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   @Nullable
   public static ams.a a(String $$0, ams.c $$1, int $$2) {
      try {
         ams.a var11;
         try (aly $$3 = $$1.a($$0)) {
            amm $$4 = $$3.a(amm.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            alv $$5 = $$3.a(alv.a);
            cdt $$6 = $$5 != null ? $$5.a() : cdt.a();
            arh<Integer> $$7 = a($$0, $$4);
            amt $$8 = amt.a($$7, $$2);
            alx $$9 = $$3.a(alx.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new ams.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static arh<Integer> a(String $$0, amm $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new arh<>($$2);
      } else {
         arh<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new arh<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public te a() {
      return this.d;
   }

   public te b() {
      return this.e.a();
   }

   public te a(boolean $$0) {
      return tg.a(this.i.a(te.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new tj(tj.a.a, te.h().b(this.d).f("\n").b(this.e.a))));
   }

   public amt c() {
      return this.e.b();
   }

   public cdt d() {
      return this.e.c();
   }

   public aly e() {
      return this.c.a(this.b, this.e);
   }

   public String f() {
      return this.b;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public ams.b i() {
      return this.f;
   }

   public amw j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ams $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(te a, amt b, cdt c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ams> $$2, boolean $$3) {
         ams.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               ams $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               ams $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public ams.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aly a(String var1);

      aly a(String var1, ams.a var2);
   }
}
