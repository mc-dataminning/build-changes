import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amu {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final amu.c c;
   private final tf d;
   private final amu.a e;
   private final amu.b f;
   private final boolean g;
   private final boolean h;
   private final amy i;

   @Nullable
   public static amu a(String $$0, tf $$1, boolean $$2, amu.c $$3, amb $$4, amu.b $$5, amy $$6) {
      int $$7 = aa.b().a($$4);
      amu.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static amu a(String $$0, tf $$1, boolean $$2, amu.c $$3, amu.a $$4, amu.b $$5, boolean $$6, amy $$7) {
      return new amu($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private amu(String $$0, boolean $$1, amu.c $$2, tf $$3, amu.a $$4, amu.b $$5, boolean $$6, amy $$7) {
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
   public static amu.a a(String $$0, amu.c $$1, int $$2) {
      try {
         amu.a var11;
         try (ama $$3 = $$1.a($$0)) {
            amo $$4 = $$3.a(amo.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            alx $$5 = $$3.a(alx.a);
            cdv $$6 = $$5 != null ? $$5.a() : cdv.a();
            ari<Integer> $$7 = a($$0, $$4);
            amv $$8 = amv.a($$7, $$2);
            alz $$9 = $$3.a(alz.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new amu.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static ari<Integer> a(String $$0, amo $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ari<>($$2);
      } else {
         ari<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ari<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public tf a() {
      return this.d;
   }

   public tf b() {
      return this.e.a();
   }

   public tf a(boolean $$0) {
      return th.a(this.i.a(tf.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new tk(tk.a.a, tf.h().b(this.d).f("\n").b(this.e.a))));
   }

   public amv c() {
      return this.e.b();
   }

   public cdv d() {
      return this.e.c();
   }

   public ama e() {
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

   public amu.b i() {
      return this.f;
   }

   public amy j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof amu $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(tf a, amv b, cdv c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, amu> $$2, boolean $$3) {
         amu.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               amu $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               amu $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public amu.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      ama a(String var1);

      ama a(String var1, amu.a var2);
   }
}
