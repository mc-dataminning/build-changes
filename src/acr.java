import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acr(int b, int c, int d, List<acr.a> e) implements zk<abz> {
   public static final zb<wo, acr> a = zb.a(yz.g, acr::e, yz.g, acr::f, yz.g, acr::g, acr.a.a.a(yz.a()), acr::h, acr::new);

   public acr(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acr.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xg::a))).toList()
      );
   }

   @Override
   public zm<acr> a() {
      return ago.r;
   }

   public void a(abz $$0) {
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

   public List<acr.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xd> c) {
      public static final zb<wo, acr.a> a = zb.a(yz.l, acr.a::a, xf.e, acr.a::b, acr.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xd> b() {
         return this.c;
      }
   }
}
