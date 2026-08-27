import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aob {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final aob.c c;
   private final ui d;
   private final aob.a e;
   private final aob.b f;
   private final boolean g;
   private final boolean h;
   private final aof i;

   @Nullable
   public static aob a(String $$0, ui $$1, boolean $$2, aob.c $$3, ani $$4, aob.b $$5, aof $$6) {
      int $$7 = aa.b().a($$4);
      aob.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static aob a(String $$0, ui $$1, boolean $$2, aob.c $$3, aob.a $$4, aob.b $$5, boolean $$6, aof $$7) {
      return new aob($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private aob(String $$0, boolean $$1, aob.c $$2, ui $$3, aob.a $$4, aob.b $$5, boolean $$6, aof $$7) {
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
   public static aob.a a(String $$0, aob.c $$1, int $$2) {
      try {
         aob.a var11;
         try (anh $$3 = $$1.a($$0)) {
            anv $$4 = $$3.a(anv.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            ane $$5 = $$3.a(ane.a);
            cfg $$6 = $$5 != null ? $$5.a() : cfg.a();
            asq<Integer> $$7 = a($$0, $$4);
            aoc $$8 = aoc.a($$7, $$2);
            ang $$9 = $$3.a(ang.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aob.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static asq<Integer> a(String $$0, anv $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new asq<>($$2);
      } else {
         asq<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new asq<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ui a() {
      return this.d;
   }

   public ui b() {
      return this.e.a();
   }

   public ui a(boolean $$0) {
      return ul.a(this.i.a(ui.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new uo(uo.a.a, ui.i().b(this.d).f("\n").b(this.e.a))));
   }

   public aoc c() {
      return this.e.b();
   }

   public cfg d() {
      return this.e.c();
   }

   public anh e() {
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

   public aob.b i() {
      return this.f;
   }

   public aof j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aob $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(ui a, aoc b, cfg c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, aob> $$2, boolean $$3) {
         aob.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               aob $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               aob $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aob.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      anh a(String var1);

      anh a(String var1, aob.a var2);
   }
}
