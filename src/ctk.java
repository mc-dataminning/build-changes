import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ctk implements cuj {
   public static final Codec<ctk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ctl.c.fieldOf("material").forGetter(ctk::b),
               ctn.c.fieldOf("pattern").forGetter(ctk::a),
               aws.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ctk::new)
   );
   public static final ye<vr, ctk> b = ye.a(ctl.d, ctk::b, ctn.d, ctk::a, yc.b, $$0 -> $$0.f, ctk::new);
   private static final wg c = wg.c(ac.a("item", new ajt("smithing_template.upgrade"))).a(n.h);
   private final il<ctl> d;
   private final il<ctn> e;
   private final boolean f;
   private final Function<il<coz>, ajt> g;
   private final Function<il<coz>, ajt> h;

   public ctk(il<ctl> $$0, il<ctn> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$1x -> {
         ajt $$2x = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2x.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         ajt $$2x = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2x.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
      this.f = $$2;
   }

   public ctk(il<ctl> $$0, il<ctn> $$1) {
      this($$0, $$1, true);
   }

   private String c(il<coz> $$0) {
      Map<il<coz>, String> $$1 = this.d.a().d();
      String $$2 = $$1.get($$0);
      return $$2 != null ? $$2 : this.d.a().a();
   }

   public boolean a(il<ctn> $$0, il<ctl> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public il<ctn> a() {
      return this.e;
   }

   public il<ctl> b() {
      return this.d;
   }

   public ajt a(il<coz> $$0) {
      return this.g.apply($$0);
   }

   public ajt b(il<coz> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof ctk $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(Consumer<wg> $$0, csz $$1) {
      if (this.f) {
         $$0.accept(c);
         $$0.accept(wf.a().b(this.e.a().a(this.d)));
         $$0.accept(wf.a().b(this.d.a().e()));
      }
   }
}
