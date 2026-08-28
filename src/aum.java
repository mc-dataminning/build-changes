import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aum {
   private static final Logger a = LogUtils.getLogger();
   private final atq b;
   private final aum.c c;
   private final aum.a d;
   private final ats e;

   @Nullable
   public static aum a(atq $$0, aum.c $$1, att $$2, ats $$3) {
      int $$4 = ac.b().a($$2);
      aum.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aum($$0, $$1, $$5, $$3) : null;
   }

   public aum(atq $$0, aum.c $$1, aum.a $$2, ats $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aum.a a(atq $$0, aum.c $$1, int $$2) {
      try {
         aum.a var11;
         try (atr $$3 = $$1.a($$0)) {
            auf $$4 = $$3.a(auf.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            atn $$5 = $$3.a(atn.a);
            cvh $$6 = $$5 != null ? $$5.a() : cvh.a();
            azg<Integer> $$7 = a($$0.a(), $$4);
            aun $$8 = aun.a($$7, $$2);
            atp $$9 = $$3.a(atp.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aum.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azg<Integer> a(String $$0, auf $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azg<>($$2);
      } else {
         azg<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azg<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atq a() {
      return this.b;
   }

   public xa b() {
      return this.b.b();
   }

   public xa c() {
      return this.d.a();
   }

   public xa a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aun d() {
      return this.d.b();
   }

   public cvh e() {
      return this.d.c();
   }

   public atr f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public ats h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aum.b k() {
      return this.e.b();
   }

   public auq l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aum $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xa a, aun b, cvh c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ats> $$2, boolean $$3) {
         aum.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               ats $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               ats $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aum.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      atr a(atq var1);

      atr a(atq var1, aum.a var2);
   }
}
