import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ari {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final ari.c c;
   private final vq d;
   private final ari.a e;
   private final ari.b f;
   private final boolean g;
   private final boolean h;
   private final arm i;

   @Nullable
   public static ari a(String $$0, vq $$1, boolean $$2, ari.c $$3, aqp $$4, ari.b $$5, arm $$6) {
      int $$7 = aa.b().a($$4);
      ari.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static ari a(String $$0, vq $$1, boolean $$2, ari.c $$3, ari.a $$4, ari.b $$5, boolean $$6, arm $$7) {
      return new ari($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private ari(String $$0, boolean $$1, ari.c $$2, vq $$3, ari.a $$4, ari.b $$5, boolean $$6, arm $$7) {
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
   public static ari.a a(String $$0, ari.c $$1, int $$2) {
      try {
         ari.a var11;
         try (aqo $$3 = $$1.a($$0)) {
            arc $$4 = $$3.a(arc.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            aql $$5 = $$3.a(aql.a);
            cjs $$6 = $$5 != null ? $$5.a() : cjs.a();
            avz<Integer> $$7 = a($$0, $$4);
            arj $$8 = arj.a($$7, $$2);
            aqn $$9 = $$3.a(aqn.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new ari.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static avz<Integer> a(String $$0, arc $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new avz<>($$2);
      } else {
         avz<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new avz<>($$2);
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

   public arj c() {
      return this.e.b();
   }

   public cjs d() {
      return this.e.c();
   }

   public aqo e() {
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

   public ari.b i() {
      return this.f;
   }

   public arm j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ari $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(vq a, arj b, cjs c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ari> $$2, boolean $$3) {
         ari.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               ari $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               ari $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public ari.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aqo a(String var1);

      aqo a(String var1, ari.a var2);
   }
}
