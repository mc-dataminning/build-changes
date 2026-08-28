import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aul {
   private static final Logger a = LogUtils.getLogger();
   private final ato b;
   private final aul.c c;
   private final aul.a d;
   private final atq e;

   @Nullable
   public static aul a(ato $$0, aul.c $$1, atr $$2, atq $$3) {
      int $$4 = ab.b().a($$2);
      aul.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aul($$0, $$1, $$5, $$3) : null;
   }

   public aul(ato $$0, aul.c $$1, aul.a $$2, atq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aul.a a(ato $$0, aul.c $$1, int $$2) {
      try {
         aul.a var11;
         try (atp $$3 = $$1.a($$0)) {
            aue $$4 = $$3.a(aue.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            atl $$5 = $$3.a(atl.a);
            crj $$6 = $$5 != null ? $$5.a() : crj.a();
            azf<Integer> $$7 = a($$0.a(), $$4);
            aum $$8 = aum.a($$7, $$2);
            atn $$9 = $$3.a(atn.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aul.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azf<Integer> a(String $$0, aue $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azf<>($$2);
      } else {
         azf<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azf<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ato a() {
      return this.b;
   }

   public xl b() {
      return this.b.b();
   }

   public xl c() {
      return this.d.a();
   }

   public xl a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aum d() {
      return this.d.b();
   }

   public crj e() {
      return this.d.c();
   }

   public atp f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atq h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aul.b k() {
      return this.e.b();
   }

   public aup l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aul $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xl a, aum b, crj c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atq> $$2, boolean $$3) {
         aul.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atq $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atq $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aul.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      atp a(ato var1);

      atp a(ato var1, aul.a var2);
   }
}
