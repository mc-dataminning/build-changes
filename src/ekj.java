import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekj extends eko {
   public static final aup<ebl> a = aul.l;
   public static final eid.a b = eid.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<ekj> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avq.a(aup.a(kg.aD), "destination", a).forGetter($$0x -> $$0x.h),
                  eid.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  avq.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  avq.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  avq.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ekj::new)
   );
   private final aup<ebl> h;
   private final eid.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   ekj(List<emb> $$0, aup<ebl> $$1, eid.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public ekq b() {
      return ekr.m;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.f);
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if (!$$0.a(cpg.uf)) {
         return $$0;
      } else {
         enz $$2 = $$1.c(eln.f);
         if ($$2 != null) {
            aow $$3 = $$1.d();
            hz $$4 = $$3.a(this.h, hz.a($$2), this.k, this.l);
            if ($$4 != null) {
               cpd $$5 = cpk.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cpk.a($$3, $$5);
               eig.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ekj.a c() {
      return new ekj.a();
   }

   public static class a extends eko.a<ekj.a> {
      private aup<ebl> a;
      private eid.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ekj.a;
         this.b = ekj.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ekj.a a() {
         return this;
      }

      public ekj.a a(aup<ebl> $$0) {
         this.a = $$0;
         return this;
      }

      public ekj.a a(eid.a $$0) {
         this.b = $$0;
         return this;
      }

      public ekj.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ekj.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ekj.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public ekp b() {
         return new ekj(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
