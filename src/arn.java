import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arn {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final arn.c c;
   private final vs d;
   private final arn.a e;
   private final arn.b f;
   private final boolean g;
   private final boolean h;
   private final arr i;

   @Nullable
   public static arn a(String $$0, vs $$1, boolean $$2, arn.c $$3, aqu $$4, arn.b $$5, arr $$6) {
      int $$7 = aa.b().a($$4);
      arn.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static arn a(String $$0, vs $$1, boolean $$2, arn.c $$3, arn.a $$4, arn.b $$5, boolean $$6, arr $$7) {
      return new arn($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private arn(String $$0, boolean $$1, arn.c $$2, vs $$3, arn.a $$4, arn.b $$5, boolean $$6, arr $$7) {
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
   public static arn.a a(String $$0, arn.c $$1, int $$2) {
      try {
         arn.a var11;
         try (aqt $$3 = $$1.a($$0)) {
            arh $$4 = $$3.a(arh.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aqq $$5 = $$3.a(aqq.a);
            ckl $$6 = $$5 != null ? $$5.a() : ckl.a();
            awe<Integer> $$7 = a($$0, $$4);
            aro $$8 = aro.a($$7, $$2);
            aqs $$9 = $$3.a(aqs.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new arn.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static awe<Integer> a(String $$0, arh $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new awe<>($$2);
      } else {
         awe<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new awe<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public vs a() {
      return this.d;
   }

   public vs b() {
      return this.e.a();
   }

   public vs a(boolean $$0) {
      return vv.a(this.i.a(vs.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vy(vy.a.a, vs.i().b(this.d).f("\n").b(this.e.a))));
   }

   public aro c() {
      return this.e.b();
   }

   public ckl d() {
      return this.e.c();
   }

   public aqt e() {
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

   public arn.b i() {
      return this.f;
   }

   public arr j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof arn $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vs a, aro b, ckl c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, arn> $$2, boolean $$3) {
         arn.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               arn $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               arn $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public arn.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aqt a(String var1);

      aqt a(String var1, arn.a var2);
   }
}
