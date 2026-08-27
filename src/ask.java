import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ask {
   private static final Logger a = LogUtils.getLogger();
   private final arn b;
   private final ask.c c;
   private final ask.a d;
   private final arp e;

   @Nullable
   public static ask a(arn $$0, ask.c $$1, arq $$2, arp $$3) {
      int $$4 = aa.b().a($$2);
      ask.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new ask($$0, $$1, $$5, $$3) : null;
   }

   public ask(arn $$0, ask.c $$1, ask.a $$2, arp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ask.a a(arn $$0, ask.c $$1, int $$2) {
      try {
         ask.a var11;
         try (aro $$3 = $$1.a($$0)) {
            asd $$4 = $$3.a(asd.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            ark $$5 = $$3.a(ark.a);
            cmg $$6 = $$5 != null ? $$5.a() : cmg.a();
            axc<Integer> $$7 = a($$0.a(), $$4);
            asl $$8 = asl.a($$7, $$2);
            arm $$9 = $$3.a(arm.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new ask.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static axc<Integer> a(String $$0, asd $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new axc<>($$2);
      } else {
         axc<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new axc<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public arn a() {
      return this.b;
   }

   public wg b() {
      return this.b.b();
   }

   public wg c() {
      return this.d.a();
   }

   public wg a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public asl d() {
      return this.d.b();
   }

   public cmg e() {
      return this.d.c();
   }

   public aro f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public arp h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public ask.b k() {
      return this.e.b();
   }

   public aso l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ask $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(wg a, asl b, cmg c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, arp> $$2, boolean $$3) {
         ask.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               arp $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               arp $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public ask.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aro a(arn var1);

      aro a(arn var1, ask.a var2);
   }
}
