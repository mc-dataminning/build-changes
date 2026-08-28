import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class auk {
   private static final Logger a = LogUtils.getLogger();
   private final atn b;
   private final auk.c c;
   private final auk.a d;
   private final atp e;

   @Nullable
   public static auk a(atn $$0, auk.c $$1, atq $$2, atp $$3) {
      int $$4 = ab.b().a($$2);
      auk.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new auk($$0, $$1, $$5, $$3) : null;
   }

   public auk(atn $$0, auk.c $$1, auk.a $$2, atp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static auk.a a(atn $$0, auk.c $$1, int $$2) {
      try {
         auk.a var11;
         try (ato $$3 = $$1.a($$0)) {
            aud $$4 = $$3.a(aud.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            atk $$5 = $$3.a(atk.a);
            crq $$6 = $$5 != null ? $$5.a() : crq.a();
            aze<Integer> $$7 = a($$0.a(), $$4);
            aul $$8 = aul.a($$7, $$2);
            atm $$9 = $$3.a(atm.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new auk.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static aze<Integer> a(String $$0, aud $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new aze<>($$2);
      } else {
         aze<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new aze<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atn a() {
      return this.b;
   }

   public xj b() {
      return this.b.b();
   }

   public xj c() {
      return this.d.a();
   }

   public xj a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aul d() {
      return this.d.b();
   }

   public crq e() {
      return this.d.c();
   }

   public ato f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atp h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public auk.b k() {
      return this.e.b();
   }

   public auo l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof auk $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xj a, aul b, crq c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atp> $$2, boolean $$3) {
         auk.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atp $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atp $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public auk.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      ato a(atn var1);

      ato a(atn var1, auk.a var2);
   }
}
