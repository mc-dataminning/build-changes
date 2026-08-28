import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eur extends euy {
   public static final axl<elg> a = axh.l;
   public static final jo<esi> b = esj.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eur> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axl.a(lw.aT).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  esi.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eur::new)
   );
   private final axl<elg> h;
   private final jo<esi> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eur(List<eww> $$0, axl<elg> $$1, jo<esi> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eva<eur> b() {
      return evb.q;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.f);
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if (!$$0.a(cvw.ul)) {
         return $$0;
      } else {
         eyw $$2 = $$1.c(ewh.f);
         if ($$2 != null) {
            arj $$3 = $$1.d();
            jf $$4 = $$3.a(this.h, jf.a((jy)$$2), this.k, this.l);
            if ($$4 != null) {
               cvs $$5 = cwf.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cwf.a($$3, $$5);
               esn.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eur.a c() {
      return new eur.a();
   }

   public static class a extends euy.a<eur.a> {
      private axl<elg> a;
      private jo<esi> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eur.a;
         this.b = eur.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eur.a a() {
         return this;
      }

      public eur.a a(axl<elg> $$0) {
         this.a = $$0;
         return this;
      }

      public eur.a a(jo<esi> $$0) {
         this.b = $$0;
         return this;
      }

      public eur.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eur.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eur.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public euz b() {
         return new eur(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
