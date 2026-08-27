import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elf extends elk {
   public static final aut<ecg> a = aup.l;
   public static final eiy.a b = eiy.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<elf> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avu.a(aut.a(ki.aE), "destination", a).forGetter($$0x -> $$0x.h),
                  eiy.a.J.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  avu.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  avu.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  avu.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, elf::new)
   );
   private final aut<ecg> h;
   private final eiy.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   elf(List<emx> $$0, aut<ecg> $$1, eiy.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public elm b() {
      return eln.m;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.f);
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if (!$$0.a(cpt.uf)) {
         return $$0;
      } else {
         eov $$2 = $$1.c(emj.f);
         if ($$2 != null) {
            apa $$3 = $$1.d();
            ib $$4 = $$3.a(this.h, ib.a($$2), this.k, this.l);
            if ($$4 != null) {
               cpq $$5 = cpx.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cpx.a($$3, $$5);
               ejc.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static elf.a c() {
      return new elf.a();
   }

   public static class a extends elk.a<elf.a> {
      private aut<ecg> a;
      private eiy.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = elf.a;
         this.b = elf.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected elf.a a() {
         return this;
      }

      public elf.a a(aut<ecg> $$0) {
         this.a = $$0;
         return this;
      }

      public elf.a a(eiy.a $$0) {
         this.b = $$0;
         return this;
      }

      public elf.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public elf.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public elf.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public ell b() {
         return new elf(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
