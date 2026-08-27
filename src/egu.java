import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egu extends egs {
   public static final MapCodec<egu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpb.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpb.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, egu::new)
   );
   private final bpb c;
   private final bpb d;

   public static egu a(bpb $$0, bpb $$1) {
      return new egu($$0, $$1);
   }

   public static egu a(bpb $$0) {
      return new egu(boy.a(0), $$0);
   }

   public static egu b(bpb $$0) {
      return new egu($$0, boy.a(0));
   }

   private egu(bpb $$0, bpb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<io> a_(egq $$0, aym $$1, io $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new io($$3, $$4, $$5));
   }

   @Override
   public egt<?> b() {
      return egt.n;
   }
}
