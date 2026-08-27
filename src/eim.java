import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eim extends eir {
   public static final asx<dzo> a = ast.l;
   public static final egg.a b = egg.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<eim> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atx.a(asx.a(ke.aD), "destination", a).forGetter($$0x -> $$0x.h),
                  egg.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  atx.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  atx.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  atx.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eim::new)
   );
   private final asx<dzo> h;
   private final egg.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   eim(List<eke> $$0, asx<dzo> $$1, egg.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eit b() {
      return eiu.m;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.f);
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if (!$$0.a(cnj.uf)) {
         return $$0;
      } else {
         emc $$2 = $$1.c(ejq.f);
         if ($$2 != null) {
            ane $$3 = $$1.d();
            hx $$4 = $$3.a(this.h, hx.a($$2), this.k, this.l);
            if ($$4 != null) {
               cng $$5 = cnn.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cnn.a($$3, $$5);
               egj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eim.a c() {
      return new eim.a();
   }

   public static class a extends eir.a<eim.a> {
      private asx<dzo> a;
      private egg.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eim.a;
         this.b = eim.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eim.a a() {
         return this;
      }

      public eim.a a(asx<dzo> $$0) {
         this.a = $$0;
         return this;
      }

      public eim.a a(egg.a $$0) {
         this.b = $$0;
         return this;
      }

      public eim.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eim.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eim.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eis b() {
         return new eim(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
