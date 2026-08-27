import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cvu(List<wu> e, List<wu> f) implements cwd {
   public static final cvu a = new cvu(List.of());
   public static final int b = 256;
   private static final xr g = xr.a.a(n.f).b(true);
   public static final Codec<cvu> c = axh.a(ww.g.listOf(), 256).xmap(cvu::new, cvu::a);
   public static final ys<wf, cvu> d = ww.b.a(yq.c(256)).a(cvu::new, cvu::a);

   public cvu(List<wu> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wx.a($$0x.f(), g)));
   }

   public cvu a(wu $$0) {
      return new cvu(ac.a(this.e, $$0));
   }

   @Override
   public void a(Consumer<wu> $$0, cuq $$1) {
      this.f.forEach($$0);
   }

   public List<wu> a() {
      return this.e;
   }

   public List<wu> b() {
      return this.f;
   }
}
