import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fch implements fcc {
   protected static final fcc a = new fch(false, -Double.MAX_VALUE, cxo.k, $$0 -> false, null) {
      @Override
      public boolean a(fcr $$0, jh $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cxo d;
   private final Predicate<etw> e;
   @Nullable
   private final bvj f;

   protected fch(boolean $$0, double $$1, cxo $$2, Predicate<etw> $$3, @Nullable bvj $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected fch(bvj $$0, boolean $$1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:625)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:627)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1018)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:902)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:895)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual bvj.ch ()Z
      // 05: aload 1
      // 06: invokevirtual bvj.dC ()D
      // 09: aload 1
      // 0a: instanceof bwf
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast bwf
      // 14: invokevirtual bwf.eX ()Lcxo;
      // 17: goto 1d
      // 1a: getstatic cxo.k Lcxo;
      // 1d: iload 2
      // 1e: ifeq 29
      // 21: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, fch.b (Letw;)Z, (Letw;)Z ]
      // 26: goto 46
      // 29: aload 1
      // 2a: instanceof bwf
      // 2d: ifeq 41
      // 30: aload 1
      // 31: checkcast bwf
      // 34: dup
      // 35: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 38: pop
      // 39: invokedynamic test (Lbwf;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, bwf.a (Letw;)Z, (Letw;)Z ]
      // 3e: goto 46
      // 41: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, fch.a (Letw;)Z, (Letw;)Z ]
      // 46: aload 1
      // 47: invokespecial fch.<init> (ZDLcxo;Ljava/util/function/Predicate;Lbvj;)V
      // 4a: return
   }

   @Override
   public boolean a(cxk $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(etw $$0, etw $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public fcr a(dxu $$0, dgq $$1, jh $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(fcr $$0, jh $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(jm.a.b) - 1.0E-5F;
   }

   @Nullable
   public bvj c() {
      return this.f;
   }
}
