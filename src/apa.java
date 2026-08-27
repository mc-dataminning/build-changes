import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class apa {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final apa.c c;
   private final vb d;
   private final apa.a e;
   private final apa.b f;
   private final boolean g;
   private final boolean h;
   private final ape i;

   @Nullable
   public static apa a(String $$0, vb $$1, boolean $$2, apa.c $$3, aoh $$4, apa.b $$5, ape $$6) {
      int $$7 = aa.b().a($$4);
      apa.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static apa a(String $$0, vb $$1, boolean $$2, apa.c $$3, apa.a $$4, apa.b $$5, boolean $$6, ape $$7) {
      return new apa($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private apa(String $$0, boolean $$1, apa.c $$2, vb $$3, apa.a $$4, apa.b $$5, boolean $$6, ape $$7) {
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
   public static apa.a a(String $$0, apa.c $$1, int $$2) {
      try {
         apa.a var11;
         try (aog $$3 = $$1.a($$0)) {
            aou $$4 = $$3.a(aou.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aod $$5 = $$3.a(aod.a);
            chb $$6 = $$5 != null ? $$5.a() : chb.a();
            atq<Integer> $$7 = a($$0, $$4);
            apb $$8 = apb.a($$7, $$2);
            aof $$9 = $$3.a(aof.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new apa.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static atq<Integer> a(String $$0, aou $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new atq<>($$2);
      } else {
         atq<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new atq<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public vb a() {
      return this.d;
   }

   public vb b() {
      return this.e.a();
   }

   public vb a(boolean $$0) {
      return ve.a(this.i.a(vb.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vh(vh.a.a, vb.i().b(this.d).f("\n").b(this.e.a))));
   }

   public apb c() {
      return this.e.b();
   }

   public chb d() {
      return this.e.c();
   }

   public aog e() {
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

   public apa.b i() {
      return this.f;
   }

   public ape j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof apa $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vb a, apb b, chb c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, apa> $$2, boolean $$3) {
         apa.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               apa $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               apa $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public apa.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aog a(String var1);

      aog a(String var1, apa.a var2);
   }
}
