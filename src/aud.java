import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aud {
   private static final Logger a = LogUtils.getLogger();
   private final atg b;
   private final aud.c c;
   private final aud.a d;
   private final ati e;

   @Nullable
   public static aud a(atg $$0, aud.c $$1, atj $$2, ati $$3) {
      int $$4 = ab.b().a($$2);
      aud.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aud($$0, $$1, $$5, $$3) : null;
   }

   public aud(atg $$0, aud.c $$1, aud.a $$2, ati $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aud.a a(atg $$0, aud.c $$1, int $$2) {
      try {
         aud.a var11;
         try (ath $$3 = $$1.a($$0)) {
            atw $$4 = $$3.a(atw.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            atd $$5 = $$3.a(atd.a);
            cqq $$6 = $$5 != null ? $$5.a() : cqq.a();
            ayx<Integer> $$7 = a($$0.a(), $$4);
            aue $$8 = aue.a($$7, $$2);
            atf $$9 = $$3.a(atf.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aud.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static ayx<Integer> a(String $$0, atw $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ayx<>($$2);
      } else {
         ayx<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ayx<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atg a() {
      return this.b;
   }

   public xe b() {
      return this.b.b();
   }

   public xe c() {
      return this.d.a();
   }

   public xe a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aue d() {
      return this.d.b();
   }

   public cqq e() {
      return this.d.c();
   }

   public ath f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public ati h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aud.b k() {
      return this.e.b();
   }

   public auh l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aud $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xe a, aue b, cqq c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ati> $$2, boolean $$3) {
         aud.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               ati $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               ati $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aud.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      ath a(atg var1);

      ath a(atg var1, aud.a var2);
   }
}
