import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arw {
   private static final Logger a = LogUtils.getLogger();
   private final aqz b;
   private final arw.c c;
   private final arw.a d;
   private final arb e;

   @Nullable
   public static arw a(aqz $$0, arw.c $$1, arc $$2, arb $$3) {
      int $$4 = aa.b().a($$2);
      arw.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new arw($$0, $$1, $$5, $$3) : null;
   }

   public arw(aqz $$0, arw.c $$1, arw.a $$2, arb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static arw.a a(aqz $$0, arw.c $$1, int $$2) {
      try {
         arw.a var11;
         try (ara $$3 = $$1.a($$0)) {
            arp $$4 = $$3.a(arp.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            aqw $$5 = $$3.a(aqw.a);
            clh $$6 = $$5 != null ? $$5.a() : clh.a();
            awo<Integer> $$7 = a($$0.a(), $$4);
            arx $$8 = arx.a($$7, $$2);
            aqy $$9 = $$3.a(aqy.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new arw.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static awo<Integer> a(String $$0, arp $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new awo<>($$2);
      } else {
         awo<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new awo<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public aqz a() {
      return this.b;
   }

   public vu b() {
      return this.b.b();
   }

   public vu c() {
      return this.d.a();
   }

   public vu a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public arx d() {
      return this.d.b();
   }

   public clh e() {
      return this.d.c();
   }

   public ara f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public arb h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public arw.b k() {
      return this.e.b();
   }

   public asa l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof arw $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vu a, arx b, clh c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, arb> $$2, boolean $$3) {
         arw.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               arb $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               arb $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public arw.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      ara a(aqz var1);

      ara a(aqz var1, arw.a var2);
   }
}
