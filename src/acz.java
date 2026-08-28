import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acz(int b, int c, int d, List<acz.a> e) implements zv<ach> {
   public static final zm<wz, acz> a = zm.a(zk.g, acz::e, zk.g, acz::f, zk.g, acz::g, acz.a.a.a(zk.a()), acz::h, acz::new);

   public acz(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acz.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xr::a))).toList()
      );
   }

   @Override
   public zx<acz> a() {
      return agt.r;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<acz.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xo> c) {
      public static final zm<wz, acz.a> a = zm.a(zk.l, acz.a::a, xq.e, acz.a::b, acz.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xo> b() {
         return this.c;
      }
   }
}
