import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eoc implements enx {
   protected static final enx a = new eoc(false, -Double.MAX_VALUE, coz.h, $$0 -> false, null) {
      @Override
      public boolean a(eol $$0, hz $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final coz d;
   private final Predicate<egp> e;
   @Nullable
   private final bno f;

   protected eoc(boolean $$0, double $$1, coz $$2, Predicate<egp> $$3, @Nullable bno $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected eoc(bno $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual bno.bW ()Z
      // 05: aload 1
      // 06: invokevirtual bno.dt ()D
      // 09: aload 1
      // 0a: instanceof bog
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast bog
      // 14: invokevirtual bog.eT ()Lcoz;
      // 17: goto 1d
      // 1a: getstatic coz.h Lcoz;
      // 1d: aload 1
      // 1e: instanceof bog
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast bog
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lbog;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, bog.a (Legp;)Z, (Legp;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, eoc.a (Legp;)Z, (Legp;)Z ]
      // 3a: aload 1
      // 3b: invokespecial eoc.<init> (ZDLcoz;Ljava/util/function/Predicate;Lbno;)V
      // 3e: return
   }

   @Override
   public boolean a(cou $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(egp $$0, egp $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(eol $$0, hz $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(ie.a.b) - 1.0E-5F;
   }

   @Nullable
   public bno c() {
      return this.f;
   }
}
