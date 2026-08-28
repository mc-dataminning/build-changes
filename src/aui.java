import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aui {
   private static final Logger a = LogUtils.getLogger();
   private final atl b;
   private final aui.c c;
   private final aui.a d;
   private final atn e;

   @Nullable
   public static aui a(atl $$0, aui.c $$1, ato $$2, atn $$3) {
      int $$4 = ab.b().a($$2);
      aui.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aui($$0, $$1, $$5, $$3) : null;
   }

   public aui(atl $$0, aui.c $$1, aui.a $$2, atn $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aui.a a(atl $$0, aui.c $$1, int $$2) {
      try {
         aui.a var11;
         try (atm $$3 = $$1.a($$0)) {
            aub $$4 = $$3.a(aub.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            ati $$5 = $$3.a(ati.a);
            crf $$6 = $$5 != null ? $$5.a() : crf.a();
            azc<Integer> $$7 = a($$0.a(), $$4);
            auj $$8 = auj.a($$7, $$2);
            atk $$9 = $$3.a(atk.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aui.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azc<Integer> a(String $$0, aub $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azc<>($$2);
      } else {
         azc<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azc<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atl a() {
      return this.b;
   }

   public xi b() {
      return this.b.b();
   }

   public xi c() {
      return this.d.a();
   }

   public xi a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public auj d() {
      return this.d.b();
   }

   public crf e() {
      return this.d.c();
   }

   public atm f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atn h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aui.b k() {
      return this.e.b();
   }

   public aum l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aui $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xi a, auj b, crf c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atn> $$2, boolean $$3) {
         aui.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atn $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atn $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aui.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      atm a(atl var1);

      atm a(atl var1, aui.a var2);
   }
}
