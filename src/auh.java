import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class auh {
   private static final Logger a = LogUtils.getLogger();
   private final atk b;
   private final auh.c c;
   private final auh.a d;
   private final atm e;

   @Nullable
   public static auh a(atk $$0, auh.c $$1, atn $$2, atm $$3) {
      int $$4 = ab.b().a($$2);
      auh.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new auh($$0, $$1, $$5, $$3) : null;
   }

   public auh(atk $$0, auh.c $$1, auh.a $$2, atm $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static auh.a a(atk $$0, auh.c $$1, int $$2) {
      try {
         auh.a var11;
         try (atl $$3 = $$1.a($$0)) {
            aua $$4 = $$3.a(aua.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            ath $$5 = $$3.a(ath.a);
            cra $$6 = $$5 != null ? $$5.a() : cra.a();
            azb<Integer> $$7 = a($$0.a(), $$4);
            aui $$8 = aui.a($$7, $$2);
            atj $$9 = $$3.a(atj.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new auh.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azb<Integer> a(String $$0, aua $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azb<>($$2);
      } else {
         azb<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azb<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atk a() {
      return this.b;
   }

   public xh b() {
      return this.b.b();
   }

   public xh c() {
      return this.d.a();
   }

   public xh a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aui d() {
      return this.d.b();
   }

   public cra e() {
      return this.d.c();
   }

   public atl f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atm h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public auh.b k() {
      return this.e.b();
   }

   public aul l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof auh $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xh a, aui b, cra c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atm> $$2, boolean $$3) {
         auh.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atm $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atm $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public auh.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      atl a(atk var1);

      atl a(atk var1, auh.a var2);
   }
}
