import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ety extends esy {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxy.d.fieldOf("pages").forGetter($$0x -> $$0x.b), esx.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ety::new)
   );
   private final List<ark<String>> b;
   private final esx c;

   protected ety(List<euw> $$0, List<ark<String>> $$1, esx $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      $$0.a(kq.I, cxy.a, this::a);
      return $$0;
   }

   public cxy a(cxy $$0) {
      List<ark<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eta<ety> b() {
      return etb.O;
   }
}
