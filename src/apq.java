import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class apq {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final apq.c c;
   private final vf d;
   private final apq.a e;
   private final apq.b f;
   private final boolean g;
   private final boolean h;
   private final apu i;

   @Nullable
   public static apq a(String $$0, vf $$1, boolean $$2, apq.c $$3, aox $$4, apq.b $$5, apu $$6) {
      int $$7 = aa.b().a($$4);
      apq.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static apq a(String $$0, vf $$1, boolean $$2, apq.c $$3, apq.a $$4, apq.b $$5, boolean $$6, apu $$7) {
      return new apq($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private apq(String $$0, boolean $$1, apq.c $$2, vf $$3, apq.a $$4, apq.b $$5, boolean $$6, apu $$7) {
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
   public static apq.a a(String $$0, apq.c $$1, int $$2) {
      try {
         apq.a var11;
         try (aow $$3 = $$1.a($$0)) {
            apk $$4 = $$3.a(apk.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aot $$5 = $$3.a(aot.a);
            chs $$6 = $$5 != null ? $$5.a() : chs.a();
            aug<Integer> $$7 = a($$0, $$4);
            apr $$8 = apr.a($$7, $$2);
            aov $$9 = $$3.a(aov.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new apq.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static aug<Integer> a(String $$0, apk $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new aug<>($$2);
      } else {
         aug<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new aug<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public vf a() {
      return this.d;
   }

   public vf b() {
      return this.e.a();
   }

   public vf a(boolean $$0) {
      return vi.a(this.i.a(vf.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vl(vl.a.a, vf.i().b(this.d).f("\n").b(this.e.a))));
   }

   public apr c() {
      return this.e.b();
   }

   public chs d() {
      return this.e.c();
   }

   public aow e() {
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

   public apq.b i() {
      return this.f;
   }

   public apu j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof apq $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vf a, apr b, chs c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, apq> $$2, boolean $$3) {
         apq.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               apq $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               apq $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public apq.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aow a(String var1);

      aow a(String var1, apq.a var2);
   }
}
