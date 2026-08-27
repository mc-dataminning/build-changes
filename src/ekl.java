import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ekl extends elg {
   public static final MapCodec<ekl> a = drb.b.xmap(dra.a::b, ddy::n).listOf().fieldOf("blocks").xmap(ekl::new, $$0 -> $$0.e);
   public static final ekl b = new ekl(ImmutableList.of(dea.pa));
   public static final ekl c = new ekl(ImmutableList.of(dea.a));
   public static final ekl d = new ekl(ImmutableList.of(dea.a, dea.pa));
   private final ImmutableList<ddy> e;

   public ekl(List<ddy> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eli<?> a() {
      return eli.e;
   }
}
