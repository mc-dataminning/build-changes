import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyz implements cza<bpt> {
   private final czf<?> b = czf.i;
   private final String c;
   private final cyn d;
   final cyv e;
   final cyv f;
   final cuh g;
   final float j;
   protected final int a;

   public cyz(cyv $$0, cyv $$1, cuh $$2, float $$3, int $$4) {
      this("", cyn.c, $$0, $$1, $$2, $$3, $$4);
   }

   private cyz(String $$0, cyn $$1, cyv $$2, cyv $$3, cuh $$4, float $$5, int $$6) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.j = $$5;
      this.a = $$6;
   }

   @Override
   public boolean a(bpt $$0, dca $$1) {
      return this.e.a($$0.a(0)) && this.f.a($$0.a(2));
   }

   @Override
   public cuh a(bpt $$0, jc.a $$1) {
      return this.g.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cuh a(jc.a $$0) {
      return this.g;
   }

   @Override
   public cuh g() {
      return new cuh(dfe.up);
   }

   @Override
   public cze<?> ao_() {
      return cze.z;
   }

   @Override
   public czf<?> e() {
      return this.b;
   }

   public int d() {
      return this.a;
   }

   public static class a implements cze<cyz> {
      private static final Codec<cyz> A = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyv.c.fieldOf("ingredient").forGetter($$0x -> $$0x.e),
                  cyv.c.fieldOf("bottle_ingredient").forGetter($$0x -> $$0x.f),
                  cuh.a.fieldOf("result").forGetter($$0x -> $$0x.g),
                  Codec.FLOAT.fieldOf("experience").forGetter($$0x -> $$0x.j),
                  Codec.INT.fieldOf("refinement_time").forGetter($$0x -> $$0x.a)
               )
               .apply($$0, cyz::new)
      );
      public static final zc<wp, cyz> a = zc.a(cyz.a::a, cyz.a::a);

      @Override
      public Codec<cyz> a() {
         return A;
      }

      @Override
      public zc<wp, cyz> b() {
         return a;
      }

      private static cyz a(wp $$0) {
         cyv $$1 = cyv.b.decode($$0);
         cyv $$2 = cyv.b.decode($$0);
         cuh $$3 = cuh.f.decode($$0);
         float $$4 = $$0.readFloat();
         int $$5 = $$0.readInt();
         return new cyz($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wp $$0, cyz $$1) {
         cyv.b.encode($$0, $$1.e);
         cyv.b.encode($$0, $$1.f);
         cuh.f.encode($$0, $$1.g);
         $$0.a($$1.j);
         $$0.p($$1.a);
      }
   }
}
