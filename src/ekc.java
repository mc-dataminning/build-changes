import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekc extends ekh {
   public static final auo<ebe> a = auk.l;
   public static final ehw.a b = ehw.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<ekc> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avp.a(auo.a(kg.aD), "destination", a).forGetter($$0x -> $$0x.h),
                  ehw.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  avp.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  avp.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  avp.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ekc::new)
   );
   private final auo<ebe> h;
   private final ehw.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   ekc(List<elu> $$0, auo<ebe> $$1, ehw.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public ekj b() {
      return ekk.m;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.f);
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if (!$$0.a(cpc.uf)) {
         return $$0;
      } else {
         ens $$2 = $$1.c(elg.f);
         if ($$2 != null) {
            aov $$3 = $$1.d();
            hz $$4 = $$3.a(this.h, hz.a($$2), this.k, this.l);
            if ($$4 != null) {
               coz $$5 = cpg.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cpg.a($$3, $$5);
               ehz.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ekc.a c() {
      return new ekc.a();
   }

   public static class a extends ekh.a<ekc.a> {
      private auo<ebe> a;
      private ehw.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ekc.a;
         this.b = ekc.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ekc.a a() {
         return this;
      }

      public ekc.a a(auo<ebe> $$0) {
         this.a = $$0;
         return this;
      }

      public ekc.a a(ehw.a $$0) {
         this.b = $$0;
         return this;
      }

      public ekc.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ekc.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ekc.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eki b() {
         return new ekc(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
