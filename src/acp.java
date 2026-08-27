import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;

public class acp implements wb<aca> {
   private static final int a = 128;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final cfy f;
   private final ckj g;
   private final Int2ObjectMap<ckj> h;

   public acp(int $$0, int $$1, int $$2, int $$3, cfy $$4, ckj $$5, Int2ObjectMap<ckj> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = Int2ObjectMaps.unmodifiable($$6);
   }

   public acp(tl $$0) {
      this.b = $$0.readByte();
      this.c = $$0.n();
      this.d = $$0.readShort();
      this.e = $$0.readByte();
      this.f = $$0.b(cfy.class);
      IntFunction<Int2ObjectOpenHashMap<ckj>> $$1 = tl.a(Int2ObjectOpenHashMap::new, 128);
      this.h = Int2ObjectMaps.unmodifiable($$0.a($$1, $$0x -> Integer.valueOf($$0x.readShort()), tl::r));
      this.g = $$0.r();
   }

   @Override
   public void a(tl $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.l(this.d);
      $$0.k(this.e);
      $$0.a(this.f);
      $$0.a(this.h, tl::l, tl::a);
      $$0.a(this.g);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public ckj f() {
      return this.g;
   }

   public Int2ObjectMap<ckj> g() {
      return this.h;
   }

   public cfy h() {
      return this.f;
   }

   public int i() {
      return this.c;
   }
}
