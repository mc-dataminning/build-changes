import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aea implements ze<abq> {
   public static final yv<vx, aea> a = ze.a(aea::a, aea::new);
   private final aea.a b;
   private final List<akn> c;
   private final List<akn> d;
   private final avm e;

   public aea(aea.a $$0, Collection<akn> $$1, Collection<akn> $$2, avm $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aea(vx $$0) {
      this.b = $$0.b(aea.a.class);
      this.e = avm.a($$0);
      this.c = $$0.a(vx::q);
      if (this.b == aea.a.a) {
         this.d = $$0.a(vx::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vx::a);
      if (this.b == aea.a.a) {
         $$0.a(this.d, vx::a);
      }
   }

   @Override
   public zg<aea> a() {
      return agc.ai;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public List<akn> b() {
      return this.c;
   }

   public List<akn> e() {
      return this.d;
   }

   public avm f() {
      return this.e;
   }

   public aea.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
