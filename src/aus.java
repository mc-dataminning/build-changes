import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aus {
   private static final Logger a = LogUtils.getLogger();
   private final atv b;
   private final aus.c c;
   private final aus.a d;
   private final atx e;

   @Nullable
   public static aus a(atv $$0, aus.c $$1, aty $$2, atx $$3) {
      int $$4 = ab.b().a($$2);
      aus.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aus($$0, $$1, $$5, $$3) : null;
   }

   public aus(atv $$0, aus.c $$1, aus.a $$2, atx $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aus.a a(atv $$0, aus.c $$1, int $$2) {
      try {
         aus.a var11;
         try (atw $$3 = $$1.a($$0)) {
            aul $$4 = $$3.a(aul.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            ats $$5 = $$3.a(ats.a);
            csk $$6 = $$5 != null ? $$5.a() : csk.a();
            azm<Integer> $$7 = a($$0.a(), $$4);
            aut $$8 = aut.a($$7, $$2);
            atu $$9 = $$3.a(atu.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aus.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azm<Integer> a(String $$0, aul $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azm<>($$2);
      } else {
         azm<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azm<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atv a() {
      return this.b;
   }

   public xk b() {
      return this.b.b();
   }

   public xk c() {
      return this.d.a();
   }

   public xk a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aut d() {
      return this.d.b();
   }

   public csk e() {
      return this.d.c();
   }

   public atw f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atx h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aus.b k() {
      return this.e.b();
   }

   public auw l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aus $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xk a, aut b, csk c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atx> $$2, boolean $$3) {
         aus.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atx $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atx $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aus.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      atw a(atv var1);

      atw a(atv var1, aus.a var2);
   }
}
