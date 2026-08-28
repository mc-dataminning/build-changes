import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atm {
   private static final Logger a = LogUtils.getLogger();
   private final asp b;
   private final atm.c c;
   private final atm.a d;
   private final asr e;

   @Nullable
   public static atm a(asp $$0, atm.c $$1, ass $$2, asr $$3) {
      int $$4 = ab.b().a($$2);
      atm.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new atm($$0, $$1, $$5, $$3) : null;
   }

   public atm(asp $$0, atm.c $$1, atm.a $$2, asr $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static atm.a a(asp $$0, atm.c $$1, int $$2) {
      try {
         atm.a var11;
         try (asq $$3 = $$1.a($$0)) {
            atf $$4 = $$3.a(atf.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            asm $$5 = $$3.a(asm.a);
            cpl $$6 = $$5 != null ? $$5.a() : cpl.a();
            ayg<Integer> $$7 = a($$0.a(), $$4);
            atn $$8 = atn.a($$7, $$2);
            aso $$9 = $$3.a(aso.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new atm.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static ayg<Integer> a(String $$0, atf $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ayg<>($$2);
      } else {
         ayg<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ayg<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public asp a() {
      return this.b;
   }

   public wz b() {
      return this.b.b();
   }

   public wz c() {
      return this.d.a();
   }

   public wz a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public atn d() {
      return this.d.b();
   }

   public cpl e() {
      return this.d.c();
   }

   public asq f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public asr h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public atm.b k() {
      return this.e.b();
   }

   public atq l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof atm $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(wz a, atn b, cpl c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, asr> $$2, boolean $$3) {
         atm.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               asr $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               asr $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public atm.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      asq a(asp var1);

      asq a(asp var1, atm.a var2);
   }
}
