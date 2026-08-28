import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aub {
   private static final Logger a = LogUtils.getLogger();
   private final ate b;
   private final aub.c c;
   private final aub.a d;
   private final atg e;

   @Nullable
   public static aub a(ate $$0, aub.c $$1, ath $$2, atg $$3) {
      int $$4 = ab.b().a($$2);
      aub.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aub($$0, $$1, $$5, $$3) : null;
   }

   public aub(ate $$0, aub.c $$1, aub.a $$2, atg $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aub.a a(ate $$0, aub.c $$1, int $$2) {
      try {
         aub.a var11;
         try (atf $$3 = $$1.a($$0)) {
            atu $$4 = $$3.a(atu.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            atb $$5 = $$3.a(atb.a);
            cqn $$6 = $$5 != null ? $$5.a() : cqn.a();
            ayv<Integer> $$7 = a($$0.a(), $$4);
            auc $$8 = auc.a($$7, $$2);
            atd $$9 = $$3.a(atd.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aub.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static ayv<Integer> a(String $$0, atu $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ayv<>($$2);
      } else {
         ayv<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ayv<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ate a() {
      return this.b;
   }

   public xd b() {
      return this.b.b();
   }

   public xd c() {
      return this.d.a();
   }

   public xd a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public auc d() {
      return this.d.b();
   }

   public cqn e() {
      return this.d.c();
   }

   public atf f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atg h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aub.b k() {
      return this.e.b();
   }

   public auf l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aub $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xd a, auc b, cqn c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atg> $$2, boolean $$3) {
         aub.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atg $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atg $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aub.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      atf a(ate var1);

      atf a(ate var1, aub.a var2);
   }
}
