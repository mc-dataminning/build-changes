import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class ckr {
   private final int a;
   private final float b;
   private final boolean c;
   private final boolean d;
   private final boolean e;
   private final List<Pair<bns, Float>> f;

   ckr(int $$0, float $$1, boolean $$2, boolean $$3, boolean $$4, List<Pair<bns, Float>> $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public int a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public List<Pair<bns, Float>> f() {
      return this.f;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private boolean d;
      private boolean e;
      private final List<Pair<bns, Float>> f = Lists.newArrayList();

      public ckr.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public ckr.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public ckr.a a() {
         this.c = true;
         return this;
      }

      public ckr.a b() {
         this.d = true;
         return this;
      }

      public ckr.a c() {
         this.e = true;
         return this;
      }

      public ckr.a a(bns $$0, float $$1) {
         this.f.add(Pair.of($$0, $$1));
         return this;
      }

      public ckr d() {
         return new ckr(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
