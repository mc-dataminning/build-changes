import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejc extends eja {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpf.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpf.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ejc::new)
   );
   private final bpf c;
   private final bpf d;

   public static ejc a(bpf $$0, bpf $$1) {
      return new ejc($$0, $$1);
   }

   public static ejc a(bpf $$0) {
      return new ejc(bpc.a(0), $$0);
   }

   public static ejc b(bpf $$0) {
      return new ejc($$0, bpc.a(0));
   }

   private ejc(bpf $$0, bpf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ir($$3, $$4, $$5));
   }

   @Override
   public ejb<?> b() {
      return ejb.o;
   }
}
