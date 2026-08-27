import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class asm {
   private static final Logger a = LogUtils.getLogger();
   private final arp b;
   private final asm.c c;
   private final asm.a d;
   private final arr e;

   @Nullable
   public static asm a(arp $$0, asm.c $$1, ars $$2, arr $$3) {
      int $$4 = aa.b().a($$2);
      asm.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new asm($$0, $$1, $$5, $$3) : null;
   }

   public asm(arp $$0, asm.c $$1, asm.a $$2, arr $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static asm.a a(arp $$0, asm.c $$1, int $$2) {
      try {
         asm.a var11;
         try (arq $$3 = $$1.a($$0)) {
            asf $$4 = $$3.a(asf.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            arm $$5 = $$3.a(arm.a);
            cmn $$6 = $$5 != null ? $$5.a() : cmn.a();
            axe<Integer> $$7 = a($$0.a(), $$4);
            asn $$8 = asn.a($$7, $$2);
            aro $$9 = $$3.a(aro.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new asm.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static axe<Integer> a(String $$0, asf $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new axe<>($$2);
      } else {
         axe<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new axe<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public arp a() {
      return this.b;
   }

   public wi b() {
      return this.b.b();
   }

   public wi c() {
      return this.d.a();
   }

   public wi a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public asn d() {
      return this.d.b();
   }

   public cmn e() {
      return this.d.c();
   }

   public arq f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public arr h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public asm.b k() {
      return this.e.b();
   }

   public asq l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof asm $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(wi a, asn b, cmn c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, arr> $$2, boolean $$3) {
         asm.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               arr $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               arr $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public asm.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      arq a(arp var1);

      arq a(arp var1, asm.a var2);
   }
}
