import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eou extends epq {
   public static final MapCodec<eou> a = dvd.a.xmap(dvc.a::b, dhy::m).listOf().fieldOf("blocks").xmap(eou::new, $$0 -> $$0.e);
   public static final eou b = new eou(ImmutableList.of(dia.pa));
   public static final eou c = new eou(ImmutableList.of(dia.a));
   public static final eou d = new eou(ImmutableList.of(dia.a, dia.pa));
   private final ImmutableList<dhy> e;

   public eou(List<dhy> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eps<?> a() {
      return eps.e;
   }
}
