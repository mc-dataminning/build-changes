import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bps extends bpl {
   public static final MapCodec<bps> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(boq.b(bpl.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bps::new)
   );
   private final boq<bpl> b;
   private final int f;
   private final int g;

   public bps(boq<bpl> $$0) {
      this.b = $$0;
      List<bos.b<bpl>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bos.b<bpl> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(ayo $$0) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0);
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.g;
   }

   @Override
   public bpm<?> c() {
      return bpm.e;
   }
}
