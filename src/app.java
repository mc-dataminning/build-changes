import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class app {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final app.c c;
   private final vf d;
   private final app.a e;
   private final app.b f;
   private final boolean g;
   private final boolean h;
   private final apt i;

   @Nullable
   public static app a(String $$0, vf $$1, boolean $$2, app.c $$3, aow $$4, app.b $$5, apt $$6) {
      int $$7 = aa.b().a($$4);
      app.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static app a(String $$0, vf $$1, boolean $$2, app.c $$3, app.a $$4, app.b $$5, boolean $$6, apt $$7) {
      return new app($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private app(String $$0, boolean $$1, app.c $$2, vf $$3, app.a $$4, app.b $$5, boolean $$6, apt $$7) {
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
   public static app.a a(String $$0, app.c $$1, int $$2) {
      try {
         app.a var11;
         try (aov $$3 = $$1.a($$0)) {
            apj $$4 = $$3.a(apj.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aos $$5 = $$3.a(aos.a);
            chr $$6 = $$5 != null ? $$5.a() : chr.a();
            auf<Integer> $$7 = a($$0, $$4);
            apq $$8 = apq.a($$7, $$2);
            aou $$9 = $$3.a(aou.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new app.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static auf<Integer> a(String $$0, apj $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new auf<>($$2);
      } else {
         auf<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new auf<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public vf a() {
      return this.d;
   }

   public vf b() {
      return this.e.a();
   }

   public vf a(boolean $$0) {
      return vi.a(this.i.a(vf.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vl(vl.a.a, vf.i().b(this.d).f("\n").b(this.e.a))));
   }

   public apq c() {
      return this.e.b();
   }

   public chr d() {
      return this.e.c();
   }

   public aov e() {
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

   public app.b i() {
      return this.f;
   }

   public apt j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof app $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vf a, apq b, chr c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, app> $$2, boolean $$3) {
         app.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               app $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               app $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public app.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aov a(String var1);

      aov a(String var1, app.a var2);
   }
}
