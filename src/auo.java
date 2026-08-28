import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class auo {
   private static final Logger a = LogUtils.getLogger();
   private final ats b;
   private final auo.c c;
   private final auo.a d;
   private final atu e;

   @Nullable
   public static auo a(ats $$0, auo.c $$1, atv $$2, atu $$3) {
      int $$4 = ac.b().a($$2);
      auo.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new auo($$0, $$1, $$5, $$3) : null;
   }

   public auo(ats $$0, auo.c $$1, auo.a $$2, atu $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static auo.a a(ats $$0, auo.c $$1, int $$2) {
      try {
         auo.a var11;
         try (att $$3 = $$1.a($$0)) {
            auh $$4 = $$3.a(auh.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            atp $$5 = $$3.a(atp.a);
            cvj $$6 = $$5 != null ? $$5.a() : cvj.a();
            azi<Integer> $$7 = a($$0.a(), $$4);
            aup $$8 = aup.a($$7, $$2);
            atr $$9 = $$3.a(atr.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new auo.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azi<Integer> a(String $$0, auh $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azi<>($$2);
      } else {
         azi<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azi<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ats a() {
      return this.b;
   }

   public xc b() {
      return this.b.b();
   }

   public xc c() {
      return this.d.a();
   }

   public xc a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aup d() {
      return this.d.b();
   }

   public cvj e() {
      return this.d.c();
   }

   public att f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atu h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public auo.b k() {
      return this.e.b();
   }

   public aus l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof auo $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xc a, aup b, cvj c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atu> $$2, boolean $$3) {
         auo.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atu $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atu $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public auo.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      att a(ats var1);

      att a(ats var1, auo.a var2);
   }
}
