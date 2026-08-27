import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class apk {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final apk.c c;
   private final vd d;
   private final apk.a e;
   private final apk.b f;
   private final boolean g;
   private final boolean h;
   private final apo i;

   @Nullable
   public static apk a(String $$0, vd $$1, boolean $$2, apk.c $$3, aor $$4, apk.b $$5, apo $$6) {
      int $$7 = aa.b().a($$4);
      apk.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static apk a(String $$0, vd $$1, boolean $$2, apk.c $$3, apk.a $$4, apk.b $$5, boolean $$6, apo $$7) {
      return new apk($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private apk(String $$0, boolean $$1, apk.c $$2, vd $$3, apk.a $$4, apk.b $$5, boolean $$6, apo $$7) {
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
   public static apk.a a(String $$0, apk.c $$1, int $$2) {
      try {
         apk.a var11;
         try (aoq $$3 = $$1.a($$0)) {
            ape $$4 = $$3.a(ape.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aon $$5 = $$3.a(aon.a);
            chl $$6 = $$5 != null ? $$5.a() : chl.a();
            aua<Integer> $$7 = a($$0, $$4);
            apl $$8 = apl.a($$7, $$2);
            aop $$9 = $$3.a(aop.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new apk.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static aua<Integer> a(String $$0, ape $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new aua<>($$2);
      } else {
         aua<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new aua<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public vd a() {
      return this.d;
   }

   public vd b() {
      return this.e.a();
   }

   public vd a(boolean $$0) {
      return vg.a(this.i.a(vd.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vj(vj.a.a, vd.i().b(this.d).f("\n").b(this.e.a))));
   }

   public apl c() {
      return this.e.b();
   }

   public chl d() {
      return this.e.c();
   }

   public aoq e() {
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

   public apk.b i() {
      return this.f;
   }

   public apo j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof apk $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vd a, apl b, chl c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, apk> $$2, boolean $$3) {
         apk.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               apk $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               apk $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public apk.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aoq a(String var1);

      aoq a(String var1, apk.a var2);
   }
}
