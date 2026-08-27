import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arj {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final arj.c c;
   private final vq d;
   private final arj.a e;
   private final arj.b f;
   private final boolean g;
   private final boolean h;
   private final arn i;

   @Nullable
   public static arj a(String $$0, vq $$1, boolean $$2, arj.c $$3, aqq $$4, arj.b $$5, arn $$6) {
      int $$7 = aa.b().a($$4);
      arj.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static arj a(String $$0, vq $$1, boolean $$2, arj.c $$3, arj.a $$4, arj.b $$5, boolean $$6, arn $$7) {
      return new arj($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private arj(String $$0, boolean $$1, arj.c $$2, vq $$3, arj.a $$4, arj.b $$5, boolean $$6, arn $$7) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.g = $$1;
      this.f = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   @Nullable
   public static arj.a a(String $$0, arj.c $$1, int $$2) {
      try {
         arj.a var11;
         try (aqp $$3 = $$1.a($$0)) {
            ard $$4 = $$3.a(ard.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aqm $$5 = $$3.a(aqm.a);
            cjw $$6 = $$5 != null ? $$5.a() : cjw.a();
            awa<Integer> $$7 = a($$0, $$4);
            ark $$8 = ark.a($$7, $$2);
            aqo $$9 = $$3.a(aqo.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new arj.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static awa<Integer> a(String $$0, ard $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new awa<>($$2);
      } else {
         awa<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new awa<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public vq a() {
      return this.d;
   }

   public vq b() {
      return this.e.a();
   }

   public vq a(boolean $$0) {
      return vt.a(this.i.a(vq.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vw(vw.a.a, vq.i().b(this.d).f("\n").b(this.e.a))));
   }

   public ark c() {
      return this.e.b();
   }

   public cjw d() {
      return this.e.c();
   }

   public aqp e() {
      return this.c.a(this.b, this.e);
   }

   public String f() {
      return this.b;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public arj.b i() {
      return this.f;
   }

   public arn j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof arj $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vq a, ark b, cjw c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, arj> $$2, boolean $$3) {
         arj.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               arj $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               arj $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public arj.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aqp a(String var1);

      aqp a(String var1, arj.a var2);
   }
}
