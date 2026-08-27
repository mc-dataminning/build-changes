import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;

public class abp implements va<aaz> {
   private static final int a = 128;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final cep f;
   private final cja g;
   private final Int2ObjectMap<cja> h;

   public abp(int $$0, int $$1, int $$2, int $$3, cep $$4, cja $$5, Int2ObjectMap<cja> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = Int2ObjectMaps.unmodifiable($$6);
   }

   public abp(sl $$0) {
      this.b = $$0.readByte();
      this.c = $$0.m();
      this.d = $$0.readShort();
      this.e = $$0.readByte();
      this.f = $$0.b(cep.class);
      IntFunction<Int2ObjectOpenHashMap<cja>> $$1 = sl.a(Int2ObjectOpenHashMap::new, 128);
      this.h = Int2ObjectMaps.unmodifiable($$0.a($$1, $$0x -> Integer.valueOf($$0x.readShort()), sl::q));
      this.g = $$0.q();
   }

   @Override
   public void a(sl $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.l(this.d);
      $$0.k(this.e);
      $$0.a(this.f);
      $$0.a(this.h, sl::l, sl::a);
      $$0.a(this.g);
   }

   public void a(aaz $$0) {
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

   public cja f() {
      return this.g;
   }

   public Int2ObjectMap<cja> g() {
      return this.h;
   }

   public cep h() {
      return this.f;
   }

   public int i() {
      return this.c;
   }
}
