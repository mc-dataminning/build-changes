import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class auv {
   private static final Logger a = LogUtils.getLogger();
   private final atz b;
   private final auv.c c;
   private final auv.a d;
   private final aub e;

   @Nullable
   public static auv a(atz $$0, auv.c $$1, auc $$2, aub $$3) {
      int $$4 = ac.b().a($$2);
      auv.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new auv($$0, $$1, $$5, $$3) : null;
   }

   public auv(atz $$0, auv.c $$1, auv.a $$2, aub $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static auv.a a(atz $$0, auv.c $$1, int $$2) {
      try {
         auv.a var11;
         try (aua $$3 = $$1.a($$0)) {
            auo $$4 = $$3.a(auo.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            atw $$5 = $$3.a(atw.a);
            cvs $$6 = $$5 != null ? $$5.a() : cvs.a();
            azr<Integer> $$7 = a($$0.a(), $$4);
            auw $$8 = auw.a($$7, $$2);
            aty $$9 = $$3.a(aty.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new auv.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azr<Integer> a(String $$0, auo $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azr<>($$2);
      } else {
         azr<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azr<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atz a() {
      return this.b;
   }

   public xg b() {
      return this.b.b();
   }

   public xg c() {
      return this.d.a();
   }

   public xg a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public auw d() {
      return this.d.b();
   }

   public cvs e() {
      return this.d.c();
   }

   public aua f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public aub h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public auv.b k() {
      return this.e.b();
   }

   public ava l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof auv $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xg a, auw b, cvs c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, aub> $$2, boolean $$3) {
         auv.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               aub $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               aub $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public auv.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aua a(atz var1);

      aua a(atz var1, auv.a var2);
   }
}
