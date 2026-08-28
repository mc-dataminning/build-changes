import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atc {
   private static final Logger a = LogUtils.getLogger();
   private final asf b;
   private final atc.c c;
   private final atc.a d;
   private final ash e;

   @Nullable
   public static atc a(asf $$0, atc.c $$1, asi $$2, ash $$3) {
      int $$4 = aa.b().a($$2);
      atc.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new atc($$0, $$1, $$5, $$3) : null;
   }

   public atc(asf $$0, atc.c $$1, atc.a $$2, ash $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static atc.a a(asf $$0, atc.c $$1, int $$2) {
      try {
         atc.a var11;
         try (asg $$3 = $$1.a($$0)) {
            asv $$4 = $$3.a(asv.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            asc $$5 = $$3.a(asc.a);
            cov $$6 = $$5 != null ? $$5.a() : cov.a();
            axw<Integer> $$7 = a($$0.a(), $$4);
            atd $$8 = atd.a($$7, $$2);
            ase $$9 = $$3.a(ase.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new atc.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static axw<Integer> a(String $$0, asv $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new axw<>($$2);
      } else {
         axw<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new axw<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public asf a() {
      return this.b;
   }

   public wu b() {
      return this.b.b();
   }

   public wu c() {
      return this.d.a();
   }

   public wu a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public atd d() {
      return this.d.b();
   }

   public cov e() {
      return this.d.c();
   }

   public asg f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public ash h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public atc.b k() {
      return this.e.b();
   }

   public atg l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof atc $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(wu a, atd b, cov c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ash> $$2, boolean $$3) {
         atc.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               ash $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               ash $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public atc.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      asg a(asf var1);

      asg a(asf var1, atc.a var2);
   }
}
