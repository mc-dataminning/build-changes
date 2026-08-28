import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esa extends esh {
   public static final awm<eiw> a = awi.l;
   public static final jj<epr> b = eps.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<esa> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awm.a(lr.aQ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  epr.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, esa::new)
   );
   private final awm<eiw> h;
   private final jj<epr> i;
   private final byte j;
   private final int k;
   private final boolean l;

   esa(List<euf> $$0, awm<eiw> $$1, jj<epr> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public esj<esa> b() {
      return esk.q;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.f);
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if (!$$0.a(cuf.uj)) {
         return $$0;
      } else {
         ewf $$2 = $$1.c(etq.f);
         if ($$2 != null) {
            aqm $$3 = $$1.d();
            ja $$4 = $$3.a(this.h, ja.a($$2), this.k, this.l);
            if ($$4 != null) {
               cuc $$5 = cuk.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cuk.a($$3, $$5);
               epw.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static esa.a c() {
      return new esa.a();
   }

   public static class a extends esh.a<esa.a> {
      private awm<eiw> a;
      private jj<epr> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = esa.a;
         this.b = esa.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected esa.a a() {
         return this;
      }

      public esa.a a(awm<eiw> $$0) {
         this.a = $$0;
         return this;
      }

      public esa.a a(jj<epr> $$0) {
         this.b = $$0;
         return this;
      }

      public esa.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public esa.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public esa.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public esi b() {
         return new esa(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
