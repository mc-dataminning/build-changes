import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class apr {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final apr.c c;
   private final vg d;
   private final apr.a e;
   private final apr.b f;
   private final boolean g;
   private final boolean h;
   private final apv i;

   @Nullable
   public static apr a(String $$0, vg $$1, boolean $$2, apr.c $$3, aoy $$4, apr.b $$5, apv $$6) {
      int $$7 = aa.b().a($$4);
      apr.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static apr a(String $$0, vg $$1, boolean $$2, apr.c $$3, apr.a $$4, apr.b $$5, boolean $$6, apv $$7) {
      return new apr($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private apr(String $$0, boolean $$1, apr.c $$2, vg $$3, apr.a $$4, apr.b $$5, boolean $$6, apv $$7) {
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
   public static apr.a a(String $$0, apr.c $$1, int $$2) {
      try {
         apr.a var11;
         try (aox $$3 = $$1.a($$0)) {
            apl $$4 = $$3.a(apl.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aou $$5 = $$3.a(aou.a);
            cia $$6 = $$5 != null ? $$5.a() : cia.a();
            auh<Integer> $$7 = a($$0, $$4);
            aps $$8 = aps.a($$7, $$2);
            aow $$9 = $$3.a(aow.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new apr.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static auh<Integer> a(String $$0, apl $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new auh<>($$2);
      } else {
         auh<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new auh<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public vg a() {
      return this.d;
   }

   public vg b() {
      return this.e.a();
   }

   public vg a(boolean $$0) {
      return vj.a(this.i.a(vg.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vm(vm.a.a, vg.i().b(this.d).f("\n").b(this.e.a))));
   }

   public aps c() {
      return this.e.b();
   }

   public cia d() {
      return this.e.c();
   }

   public aox e() {
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

   public apr.b i() {
      return this.f;
   }

   public apv j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof apr $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vg a, aps b, cia c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, apr> $$2, boolean $$3) {
         apr.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               apr $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               apr $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public apr.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aox a(String var1);

      aox a(String var1, apr.a var2);
   }
}
