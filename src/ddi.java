import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record ddi(int f) implements dcq, ddp {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<ddi> d = azg.a(0, 4).xmap(ddi::new, ddi::a);
   public static final ze<wp, ddi> e = ze.a(zc.h, ddi::a, ddi::new);

   @Override
   public void a(dkj $$0, byf $$1, dak $$2, dcp $$3) {
      $$1.a(new bwi(bwk.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      List<bwi> $$4 = List.of(new bwi(bwk.E, 120000, this.f, false, false, true));
      dcg.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
