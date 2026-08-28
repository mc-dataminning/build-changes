import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atw {
   private static final Logger a = LogUtils.getLogger();
   private final asz b;
   private final atw.c c;
   private final atw.a d;
   private final atb e;

   @Nullable
   public static atw a(asz $$0, atw.c $$1, atc $$2, atb $$3) {
      int $$4 = aa.b().a($$2);
      atw.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new atw($$0, $$1, $$5, $$3) : null;
   }

   public atw(asz $$0, atw.c $$1, atw.a $$2, atb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static atw.a a(asz $$0, atw.c $$1, int $$2) {
      try {
         atw.a var11;
         try (ata $$3 = $$1.a($$0)) {
            atp $$4 = $$3.a(atp.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            asw $$5 = $$3.a(asw.a);
            cpk $$6 = $$5 != null ? $$5.a() : cpk.a();
            ayq<Integer> $$7 = a($$0.a(), $$4);
            atx $$8 = atx.a($$7, $$2);
            asy $$9 = $$3.a(asy.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new atw.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static ayq<Integer> a(String $$0, atp $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ayq<>($$2);
      } else {
         ayq<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ayq<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public asz a() {
      return this.b;
   }

   public xo b() {
      return this.b.b();
   }

   public xo c() {
      return this.d.a();
   }

   public xo a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public atx d() {
      return this.d.b();
   }

   public cpk e() {
      return this.d.c();
   }

   public ata f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atb h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public atw.b k() {
      return this.e.b();
   }

   public aua l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof atw $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xo a, atx b, cpk c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atb> $$2, boolean $$3) {
         atw.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atb $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atb $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public atw.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      ata a(asz var1);

      ata a(asz var1, atw.a var2);
   }
}
