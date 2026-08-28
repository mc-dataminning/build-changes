import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eof extends epb {
   public static final MapCodec<eof> a = duo.a.xmap(dun.a::b, dhj::o).listOf().fieldOf("blocks").xmap(eof::new, $$0 -> $$0.e);
   public static final eof b = new eof(ImmutableList.of(dhl.pa));
   public static final eof c = new eof(ImmutableList.of(dhl.a));
   public static final eof d = new eof(ImmutableList.of(dhl.a, dhl.pa));
   private final ImmutableList<dhj> e;

   public eof(List<dhj> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected epd<?> a() {
      return epd.e;
   }
}
