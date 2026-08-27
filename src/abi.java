import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class abi implements xg<zb> {
   private final abi.a a;
   private final List<ahh> b;
   private final List<ahh> c;
   private final arx d;

   public abi(abi.a $$0, Collection<ahh> $$1, Collection<ahh> $$2, arx $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public abi(uj $$0) {
      this.a = $$0.b(abi.a.class);
      this.d = arx.a($$0);
      this.b = $$0.a(uj::t);
      if (this.a == abi.a.a) {
         this.c = $$0.a(uj::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, uj::a);
      if (this.a == abi.a.a) {
         $$0.a(this.c, uj::a);
      }
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public List<ahh> a() {
      return this.b;
   }

   public List<ahh> d() {
      return this.c;
   }

   public arx e() {
      return this.d;
   }

   public abi.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
