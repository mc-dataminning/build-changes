import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ate {
   private static final Logger a = LogUtils.getLogger();
   private final ash b;
   private final ate.c c;
   private final ate.a d;
   private final asj e;

   @Nullable
   public static ate a(ash $$0, ate.c $$1, ask $$2, asj $$3) {
      int $$4 = aa.b().a($$2);
      ate.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new ate($$0, $$1, $$5, $$3) : null;
   }

   public ate(ash $$0, ate.c $$1, ate.a $$2, asj $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ate.a a(ash $$0, ate.c $$1, int $$2) {
      try {
         ate.a var11;
         try (asi $$3 = $$1.a($$0)) {
            asx $$4 = $$3.a(asx.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            ase $$5 = $$3.a(ase.a);
            coz $$6 = $$5 != null ? $$5.a() : coz.a();
            axy<Integer> $$7 = a($$0.a(), $$4);
            atf $$8 = atf.a($$7, $$2);
            asg $$9 = $$3.a(asg.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new ate.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static axy<Integer> a(String $$0, asx $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new axy<>($$2);
      } else {
         axy<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new axy<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ash a() {
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

   public atf d() {
      return this.d.b();
   }

   public coz e() {
      return this.d.c();
   }

   public asi f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public asj h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public ate.b k() {
      return this.e.b();
   }

   public ati l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ate $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(wu a, atf b, coz c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, asj> $$2, boolean $$3) {
         ate.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               asj $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               asj $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public ate.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      asi a(ash var1);

      asi a(ash var1, ate.a var2);
   }
}
